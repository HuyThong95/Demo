public class MyList extends MyAbstract {
    protected int size = 6;
    private Object[] myObj = new Object[size];

    public MyList(){

    }

    public MyList(Object[] e){
        for(int i = 0; i < e.length; i++){
            add(e[i]);
        }

    }

    public void createNewArray(){
        while (myObj.length < size){
            myObj = new Object[size + 1];
        }
    }

    public void add(Object e, int index){
        createNewArray();
        myObj[index] = e;
        }


    public int size(){
        return size;
    }

    public Object get(int index){
        return myObj[index];
    }

    public Object remove(int index){
        Object o = myObj[index];
        for (int i = index; i < size -1; i++){
            myObj[i] = myObj[i+1];
        }
        myObj[size-1] = null;
        return o;
    }
    public void removeAll(){
        myObj = new Object[size];
        size = 0;
    }

    public void replace(int index, Object o){
        myObj[index] = o;
    }







}
