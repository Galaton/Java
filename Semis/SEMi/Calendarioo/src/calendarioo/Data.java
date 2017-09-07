
package calendarioo;


public class Data {
    private int dia,mes,ano;
   
    private boolean verificar(int x,int y){
        if((y<=0)||(y>12)){
            return false;
        }
        if((y==1)||(y==3)||(y==5)||(y==7)||(y==8)||(y==10)||(y==12)){
            if((x>=1)&&(x<=31)){
                return true;
            }else{
                return false;
            }
        }
        else{
        if(y==2){
            if((x>=1)&&(x<=28)){
                return true;
            }
            else{
                return false;
            }
        }else{
            if((x>=1)&&(x<=30)){
                return true;
            }
            else{
                return false;
            }
        }
    }

   
}
        public void set(int x,int y,int z){
            if(verificar(x,y)==true){
               dia = x;
               mes = y;
               ano = z;
  
            }else{
                System.out.print("Erro!");
            }
            
        }
        public void incrementar(int x){
            if(x>365){
               ano = x/365;
               x = x % 365;
            }
            for(int i = x;i>0;i-- ){
                if((mes==1)||(mes==3)||(mes==5)||(mes==7)||(mes==8)||(mes==10)||(mes==12)){
                    if(dia==31){
                        mes ++;
                        dia = 1;
                    }
                    else{
                        dia ++;
                    }
                }else{
                    if(mes == 2){
                        if(dia == 28){
                            mes++;
                            dia = 1;
                        }
                        else{
                            dia++;
                        }
                    }else{
                        if(dia==31){
                            mes++;
                            dia = 1; 
                        }
                    }
                }
                
            }
            
        }
        
}
