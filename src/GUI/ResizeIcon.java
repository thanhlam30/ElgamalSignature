/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;
import javax.swing.ImageIcon;
import java.awt.Image;
/**
 *
 * @author ADMIN
 */
public class ResizeIcon {
    public static ImageIcon resizeIcon(String path, int width, int height) {
        // Tạo ImageIcon từ tệp hình ảnh và thay đổi kích thước
        ImageIcon originalIcon = new ImageIcon(ResizeIcon.class.getResource(path));
        Image image = originalIcon.getImage();
        Image resizedImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImage);
    }
}
