public class NumeroComplesso {
    int r;
    int i;

    NumeroComplesso(int r, int i){
        this.r = r;
        this.i = i;
    }

    void Somma(NumeroComplesso c1, NumeroComplesso c2){
        this.r = c1.getR() + c2.getR();
        this.i = c1.getI() + c2.getI();
    }

    int getR(){
        return r;
    }

    int getI(){
        return i;
    }

    @Override
    public String toString(){
        if(i >= 0) {
            return r + "+" + i + "i";
        }else{
            return r + "-" + i + "i";
        }
    }

}
