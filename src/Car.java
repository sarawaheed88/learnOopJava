public class Car {
    private String name ;
    private int maxSpeed ;
    private float price ;
    private int model ;

    void setName( String n ){
        name = n ;
    }
    String getName(){
        return name ;
    }
    void setModel ( int m ){
        if( m >= 2015 ) {
            model = m;
        }else { System.out.println(" Sorry we don't accept this model "); }
    }
    int getModel(){
        return model ;
    }



}
