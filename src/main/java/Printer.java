public class Printer {

    private int sheets;
    private int toner;

    public Printer(int sheets, int toner){
        this.sheets = sheets;
        this.toner = toner;
    }

    public int noOfPages(){
        return this.sheets;
    }

    public int print(int pages, int copies){
        int totalsheets = pages * copies;
        if (this.sheets > totalsheets && this.toner > totalsheets){
            this.toner = this.toner - totalsheets;
            this.sheets = this.sheets - totalsheets;
            return this.toner & this.sheets;
        }
        else{
            return this.toner & this.sheets;
        }
    }
}
