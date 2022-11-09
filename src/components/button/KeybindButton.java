package components.button;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;

public class KeybindButton extends JButton {
    
     public Icon getPrefixIcon() {
        return prefixIcon;
    }

    public void setPrefixIcon(Icon prefixIcon) {
        this.prefixIcon = prefixIcon;
        initBorder();
    }

    public Icon getSuffixIcon() {
        return suffixIcon;
    }

    public void setSuffixIcon(Icon suffixIcon) {
        this.suffixIcon = suffixIcon;
        initBorder();
    }

    private Icon prefixIcon;
    private Icon suffixIcon;

    public Color getEffectColor() {
        return effectColor;
    }

    public void setEffectColor(Color effectColor) {
        this.effectColor = effectColor;
    }

    public int getRounded() {
        return rounded;
    }

    public void setRounded(int rounded) {
        this.rounded = rounded;
    }

    public boolean isColorVariants() {
        return colorVariants;
    }

    public void setColorVariants(boolean colorVariants) {
        this.colorVariants = colorVariants;
    }

    public Color getOutlineHoverColor() {
        return outlineHoverColor;
    }

    public void setOutlineHoverColor(Color outlineHoverColor) {
        this.outlineHoverColor = outlineHoverColor;
    }

    public Color getHoverColor() {
        return hoverColor;
    }

    public void setHoverColor(Color hoverColor) {
        this.hoverColor = hoverColor;
    }

    private boolean isHovered = false, colorVariants = false;
    private int rounded = 12;
    private Color effectColor = new Color(90, 125, 240), outlineHoverColor = new Color(137, 176, 212), hoverColor = new Color(247, 247, 247);
    private ArrayList<Animation> rippleAnimation;

    public KeybindButton() {
        rippleAnimation = new ArrayList<>();
        setContentAreaFilled(false);
        setBorder(new EmptyBorder(5, 0, 5, 0));
        setBackground(Color.WHITE);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                rippleAnimation.removeIf((t) -> { // remove elements
                    return t.alpha == 0;
                });
                Color c = effectColor;
                if (colorVariants) {
                    float[] hsv = new float[3];
                    Color.RGBtoHSB(effectColor.getRed(), effectColor.getGreen(), effectColor.getBlue(), hsv); // convert Color to hsb
                    c = new Color(Color.HSBtoRGB((hsv[0] + (float)Math.random() * 0.1f - 0.05f) % 1, hsv[1], hsv[2])); // randomize hue and convert back to RGB
                }

                rippleAnimation.add(new Animation(me.getPoint(), c, Math.max(getWidth(), getHeight()) * 2, KeybindButton.this));
            }

            @Override
            public void mouseExited(MouseEvent me) {
                isHovered = false;
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                isHovered = true;
            }
        });
    }

    void drawRippleEffect(Graphics2D g2) {
        for (Animation a : rippleAnimation) {
            g2.setColor(a.effectColor);
            g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_ATOP, a.alpha));
            g2.fillOval((int) (a.pressedPoint.x - a.animatSize / 2), (int) (a.pressedPoint.y - a.animatSize / 2), (int) a.animatSize, (int) a.animatSize);
        }
    }

    @Override
    protected void paintComponent(final Graphics g) {
        int width = getWidth();
        int height = getHeight();
        
        BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(isHovered ? hoverColor : getBackground());
        g2.fillRoundRect(0, 0, width, height, rounded, rounded);
        g2.setColor(isHovered ? outlineHoverColor : getBackground().darker());
        g2.drawRoundRect(0, 0, width - 1, height - 1, rounded, rounded);

        drawRippleEffect(g2);

        g2.dispose();
        g.drawImage(img, 0, 0, null);
        
        paintIcon(g);
        super.paintComponent(g);
    }
    
    private void paintIcon(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        if (prefixIcon != null) {
            Image prefix = ((ImageIcon) prefixIcon).getImage();
            int y = (getHeight() - prefixIcon.getIconHeight()) / 2;
            g2.drawImage(prefix, 10, y, this);
        }
        if (suffixIcon != null) {
            Image suffix = ((ImageIcon) suffixIcon).getImage();
            int y = (getHeight() - suffixIcon.getIconHeight()) / 2;
            g2.drawImage(suffix, getWidth() - suffixIcon.getIconWidth() - 10, y, this);
        }
    }

    private void initBorder() {
        int left = 15;
        int right = 15;
        //  5 is default
        if (prefixIcon != null) {
            //  prefix is left
            left = prefixIcon.getIconWidth() + 15;
        }
        if (suffixIcon != null) {
            //  suffix is right
            right = suffixIcon.getIconWidth() + 15;
        }
        setBorder(javax.swing.BorderFactory.createEmptyBorder(10, left, 10, right));
    }
}
