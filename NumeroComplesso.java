public class NumeroComplesso {
    int r;
    int i;

    NumeroComplesso(int r, int i){
        this.r = r;
        this.i = i;
    }

    NumeroComplesso(NumeroComplesso c){
        this.r = c.getR();
        this.i = c.getI();
    }

    NumeroComplesso Somma(NumeroComplesso c2){
        int C3r = this.r + c2.getR();
        int C3i = this.i + c2.getI();

        return new NumeroComplesso(C3r,C3i);
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
            return "" + r + i + "i";
        }
    }

}


