/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author Ram Sundar
 */
public class FXMLDocumentController implements Initializable {
    
    
    @FXML
    float data=0f;
    int operation=-1;
    private Label label;

    @FXML
    private Label display;

    @FXML
    private Button ac;

    @FXML
    private Button plusminus;

    @FXML
    private Button mod;

    @FXML
    private Button devide;

    @FXML
    private Button seven;

    @FXML
    private Button eight;

    @FXML
    private Button nine;

    @FXML
    private Button star;

    @FXML
    private Button four;

    @FXML
    private Button five;

    @FXML
    private Button six;

    @FXML
    private Button minus;

    @FXML
    private Button two;

    @FXML
    private Button three;

    @FXML
    private Button plus;

    @FXML
    private Button coma;

    @FXML
    private Button equals;

    @FXML
    private Button one;

    @FXML
    private Button zero;

    @FXML
    void handleButtonAction(ActionEvent event) {
        
        if(event.getSource()==one)
        {
            display.setText(display.getText() + "1");
        }
        else if(event.getSource()==two)
        {
            display.setText(display.getText() + "2");
        }
        else if(event.getSource()==three)
        {
            display.setText(display.getText() + "3");
        }
        else if(event.getSource()==four)
        {
            display.setText(display.getText() + "4");
        }
        else if(event.getSource()==five)
        {
            display.setText(display.getText() + "5");
        }
        else if(event.getSource()==six)
        {
            display.setText(display.getText() + "6");
        }
        else if(event.getSource()==seven)
        {
            display.setText(display.getText() + "7");
        }
        else if(event.getSource()==eight)
        {
            display.setText(display.getText() + "8");
        }
        else if(event.getSource()==nine)
        {
            display.setText(display.getText() + "9");
        }
        else if(event.getSource()==zero)
        {
            display.setText(display.getText() + "0");
        }
        else if(event.getSource()==plus)
        {
            data=Float.parseFloat(display.getText());
            operation=1;
            display.setText("");
        }
        else if(event.getSource()==minus)
        {
            data=Float.parseFloat(display.getText());
            operation=2;
            display.setText("");
        }
        else if(event.getSource()==star)
        {
            data=Float.parseFloat(display.getText());
            operation=3;
            display.setText("");
        }
        else if(event.getSource()==devide)
        {
            data=Float.parseFloat(display.getText());
            operation=4;
            display.setText("");
        }
        else if(event.getSource()==coma)
        {
            int fact=1;
            data=Float.parseFloat(display.getText());
            for(int i=1;i<=data;i++)
            {
             fact=(int) (i*fact);   
             display.setText("Fact : "+ fact);
            }
        }
        else if(event.getSource()==mod)
        {
            display.setText("%");
        }
        else if(event.getSource()==ac)
        {
            display.setText("");
        
        }
        else if(event.getSource()==plusminus)
        {
            display.setText("+/-");
        }
        else if(event.getSource()==equals)
                {
            Float secondoperation =Float.parseFloat(display.getText());
            switch(operation)
            {
                case 1:
                    Float ans=data+secondoperation;
                    display.setText(String.valueOf(ans));break;
                case 2:
                    ans=data-secondoperation;
                    display.setText(String.valueOf(ans));break;
                case 3:
                    ans=data*secondoperation;
                    display.setText(String.valueOf(ans));break;
                case 4:
                    ans=0f;
                    try{
                    ans=data/secondoperation;
                    }catch(Exception e){display.setText("Error");}
                    display.setText(String.valueOf(ans));break;
        }
            
        }

    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
