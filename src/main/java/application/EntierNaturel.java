package application;

public class EntierNaturel {
    int val ;
    EntierNaturel(int val){
        try {
            if (val < 0) throw new NombreNegatifException("pay attention the number is negatif!!");
            this.val = val;
            System.out.println("created successfully");
        }catch (NombreNegatifException e){
            System.out.println(e.getMessage());
        }
    }

    public void setVal(int val) {
        try {
            if (val < 0) throw new NombreNegatifException("pay attention the number is negatif!!");
            this.val = val;
            System.out.println("new value is set successfully");
        }catch (NombreNegatifException e){
            System.out.println(e.getMessage());
        }
    }

    public int getVal() {
        return val;
    }
    public void decrementer(){
        try {
            if (val == 0) throw new NombreNegatifException("the number already equals 0 !!");
            this.val=this.val-1 ;
            System.out.println("the new value of the number now is :"+val);
        }catch (NombreNegatifException e){
            System.out.println(e.getMessage());
        }

    }
}
