package GenericWildcard02.Phone;

import java.util.ArrayList;
import java.util.List;

public class Phone {
    public void something(){
        System.out.println("From Phone superclass: Do something");
    }
}

class iPhone extends Phone{

}

class AndroidPhone extends Phone{

}

class Adapter{
    public void adapter(List<? super AndroidPhone> aPhone){
        //for loop
        //take the list of the aPhone object
        for(int i=0;i<aPhone.size();i++){
            Phone pn = (AndroidPhone)aPhone.get(i);
            pn.something();
        }
    }
}

class PhoneTester{
    public static void main(String[] args) {
        Phone ph = new Phone();
        Adapter ad = new Adapter();


        List<AndroidPhone> ap = List.of(new AndroidPhone(), new AndroidPhone());
        ad.adapter(ap);
    }
}