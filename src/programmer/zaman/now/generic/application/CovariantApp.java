package programmer.zaman.now.generic.application;

import programmer.zaman.now.generic.MyData;

public class CovariantApp {
    public static void main(String[] args) {

        MyData<String> stringMyData = new MyData<>("Kahfi");
        process(stringMyData);

        MyData<? extends Object> myData = stringMyData;

    }

    public static void process(MyData<? extends Object> myData) {
        System.out.println(myData.getData());

        // myData.setData("Kahfi"); tidak boleh, karena berbahaya
    }
}
