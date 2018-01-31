package uzdaviniai;



public class LyginisNelyginis {
    private int _a;

    public int getA() {return _a;}

    public void setA(int value) {this._a = value;}

    public void Skaiciuok(){

        if (_a % 2 == 0) {
            System.out.println("Skaicius yra lyginis");
        } else {
            System.out.println("Skaicius yra nelyginis");
        }
    }
}
