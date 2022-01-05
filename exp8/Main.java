class Phone { 
    public Phone() { 
        System.out.println("Class Phone"); 
    } 
    public void phoneType() { 
        System.out.println("Phone Type: Touchscreen"); 
    } 
} 

class IPhone extends Phone { 
    public IPhone() { 
        System.out.println("Class IPhone"); 
    } 
    public void brand() { 
        System.out.println("Brand: IPhone"); 
    } 
}

class IPhone13 extends IPhone { 
    public IPhone13() { 
        System.out.println("IPhone Model: 13"); 
    } 

    public static void main(String args[]) { 
        IPhone13 obj = new IPhone13(); 
        obj.phoneType(); 
        obj.brand(); 
    } 
} 