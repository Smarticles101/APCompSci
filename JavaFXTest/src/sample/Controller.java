package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.*;

public class Controller {
    final static String performance = "Performance:";

    @FXML
    NumberAxis xAxis;
    @FXML
    CategoryAxis yAxis;

    @FXML
    LineChart<String, Number> bc;

    @FXML
    public void initialize(){
        xAxis.setLabel("Percent");
        xAxis.setTickLabelRotation(90);
        yAxis.setLabel("Performance");
        System.out.println("YAY");
        XYChart.Series<String, Number> series1 = new XYChart.Series();
        series1.getData().add(new XYChart.Data( performance, 80));
        bc.getData().add(series1);
    }
}
