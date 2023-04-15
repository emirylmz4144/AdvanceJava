import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {

        File file = new File("C:\\Users\\90530\\Pictures\\Ekran görüntüsü 2023-03-31 123631.jpg");//Resme ait dosya yolu alınır
        FileInputStream fileInputStream;

        byte[] bytes = new byte[1024];//Dosya resim olduğu için ham verisi alınmalı bu ise verinin byte türünden alınması ile gerçekleşebilir..

        try
        {
            fileInputStream = new FileInputStream(file);
            bytes = fileInputStream.readAllBytes();//Alınan verilerin byte türü byte dizimize aktarılır

            /*
            //Farklı bir kullanım eklenerek hafızada yer edinmesi sağlanmak istenmiştir..
            byte [] exampleBytes=new byte[1024];
            fileInputStream=new FileInputStream(file);
            while ((fileInputStream.read(exampleBytes))!=-1)
            {
                System.out.print(Arrays.toString(exampleBytes));
            }

             */

        } catch (IOException e)
          {
            System.out.println(e.getMessage());
          }

        byte[] imageData = bytes; // Burada byte verileri alınır

        JButton button = new JButton("Yakışıklı görmek için tıkla");// Buton oluşturma ve ekrana eklenmesi
        button.setFont(new Font("Arial", Font.BOLD, 32)); // Buton fontunu ve boyutunu ayarlama

        button.addActionListener(new ActionListener()       //butona yapacağı aksiyon atanır
        {
            public void actionPerformed(ActionEvent e)
            {
                showImage(imageData);
            }
        });

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout()); // Panelin layoutunu ayarlama
        panel.setPreferredSize(new Dimension(800, 600)); // Panel boyutunu ayarlama
        GridBagConstraints c = new GridBagConstraints();

        c.gridx = 0;
        c.gridy = 0;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.anchor = GridBagConstraints.CENTER;

        panel.add(button, c); // Butonu panele ekleme

        // Frame oluşturma ve butonun ortalanması
        JFrame frame = new JFrame();
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void showImage(byte[] imageData) {
        try {
            // Byte dizisini BufferedImage nesnesine dönüştürme
            ByteArrayInputStream bis = new ByteArrayInputStream(imageData);
            BufferedImage image = ImageIO.read(bis);

            // Resmi gösterme
            JFrame frame = new JFrame();
            frame.getContentPane().add(new JLabel(new ImageIcon(image)));
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}