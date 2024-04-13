// Importa os pacotes necessários da biblioteca Swing e AWT
import javax.swing.*;
//JAVA SWING é uma biblioteca de interface gráfica de usuário (GUI) que permite criar interfaces gráficas para seus aplicativos Java;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//AWT (Abstract Window Toolkit) é biblioteca da classe java que implementa interface do applet através de janelas.
//Um applet é um programa Java™ projetado para ser incluído em um documento da Web HTML. Você pode escrever
// seu applet Java e incluê-lo em uma página HTML, muito da mesma forma como uma imagem é incluída.

// Define a classe SimpleJavaProject que estende JFrame para criar uma janela
public class windowjava_one extends JFrame {

    public windowjava_one() {
        setTitle("Java project");""
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Define a ação padrão quando a janela é fechada para encerrar a aplicação
        setLocationRelativeTo(null); // Define a posição inicial da janela para o centro da tela

        // Cria um painel para conter os componentes
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panel.setLayout(new FlowLayout());


        // Criação de botoões
        JButton button = new JButton("Clique Aqui!");
        JButton button2 = new JButton("Clique Aqui!");
        JButton button3 = new JButton("Clique Aqui!");
        JButton button4 = new JButton("Clique Aqui!");


        // Adiciona um listener para o botão 1
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(windowjava_one.this, "Mensagem 1");

            }
        });

        // Adiciona um listener para o segundo botão 2
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(windowjava_one.this, "Mensagem 2");
            }
        });

        // Adiciona um listener para o segundo botão 3
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(windowjava_one.this, "Mensagem 3");
            }
        });

        // Adiciona um listener para o segundo botão 4
        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(windowjava_one.this, "Mensagem 4");
            }
        });


        // Adiciona o botão ao painel
        panel.add(button); // Adição do primeiro botão ao painel;
        panel.add(button2); // Adição do segundo botão ao painel;
        panel.add(button3); // Adição do terceiro botão ao painel;
        panel.add(button4); // Adição do quarto botão ao painel;

        // Adiciona o painel à janela
        add(panel);

        // Define a janela como visível após configurar todos os componentes
        setVisible(true);


    }



    public static void main(String[] args) {
        // Cria uma instância da classe SimpleJavaProject (que é uma janela)
        // Isso irá chamar o construtor e exibir a janela
        new windowjava_one();
    }
}
