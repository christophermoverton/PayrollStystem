/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author christopher
 */
public class RoundJTextField extends javax.swing.JTextField {
    private java.awt.Shape shape;
    public RoundJTextField(int size) {
        super(size);
        this.setOpaque(false); // As suggested by @AVD in comment.
    }
    protected void paintComponent(java.awt.Graphics g) {
         g.setColor(this.getBackground());
         g.fillRoundRect(0, 0, this.getWidth()-1, this.getHeight()-1, 15, 15);
         super.paintComponent(g);
    }
    protected void paintBorder(java.awt.Graphics g) {
         g.setColor(this.getForeground());
         g.drawRoundRect(0, 0, this.getWidth()-1, this.getHeight()-1, 15, 15);
    }
    public boolean contains(int x, int y) {
         if (shape == null || !shape.getBounds().equals(this.getBounds())) {
             shape = new java.awt.geom.RoundRectangle2D.Float(0, 0, this.getWidth()-1, this.getHeight()-1, 15, 15);
         }
         return shape.contains(x, y);
    }
}
