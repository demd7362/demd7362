package ch16.practice;



class Button {
    @FunctionalInterface
    public static interface ClickListener{
        void onClick();
    }

    private ClickListener clickListener;

    public void setClickListener(ClickListener clickListener){
        this.clickListener = clickListener;
    }

    public void click(){
        this.clickListener.onClick();
    }
}

public class Q05 {
    public static void main(String[] args) {
        Button btnOk = new Button();
        btnOk.setClickListener( () -> System.out.println("Ok"));
        btnOk.click();
        
        Button btnCancel = new Button();
        btnCancel.setClickListener(() -> System.out.println("Cancel"));
        btnCancel.click();
    }
}
