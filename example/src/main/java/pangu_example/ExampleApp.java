package pangu_example;

import ws.vinta.pangu.Pangu;

public class ExampleApp {
    public static void main(String[] args) {
        Pangu pangu = new Pangu();

        String text = pangu.spacingText("東邪、西毒、南帝、北丐和Ichiro Suzuki五人，為爭一部The Old Man and the Sea，約定在板橋Mega City的3樓比武較量。");
        System.out.println(text);
    }
}
