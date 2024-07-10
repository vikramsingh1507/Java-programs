import java.io.ObjectStreamClass;

class ObjectAsParameter {
    int a, b;

    ObjectAsParameter(int a, int b){
        this.a = a;
        this.b = b;
    }

    boolean equalTo(ObjectAsParameter o){
        if(o.a == a && o.b == b){
            return true;
        }else {
            return false;
        }
    }
}

public class PassOb {
    public static void main(String[] args) {
        ObjectAsParameter ob1 = new ObjectAsParameter(100, 200);
        ObjectAsParameter ob2 = new ObjectAsParameter(100, 200);
        ObjectAsParameter ob3 = new ObjectAsParameter(23, 24);

        System.out.println("ob1 == ob2 " + ob1.equalTo(ob2));
        System.out.println("ob1 == ob3 " + ob1.equalTo(ob3));
    }
}