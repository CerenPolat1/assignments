package day28_Abstraction;

public abstract class aaa implements  c7_InterfacePractice {

    //we can use implements keywords from abstract class, and also regular class to call interface

    //AYRICA, EGER REGULAR OR ABSTRaCT CLASS'DAN INTERFACE CAGIRACAKSAN SADECE IMPLEMENTS KULLANABILIRSIN EXTEND OLMAZ


    public aaa() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }


}
