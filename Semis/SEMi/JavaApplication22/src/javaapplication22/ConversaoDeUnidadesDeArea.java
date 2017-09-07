/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication22;

/**
 *
 * @author gabriel
 */
public class ConversaoDeUnidadesDeArea {
    
    
    public static double Conversion(String unidade,double area){
        
        if("metro".equals(unidade)){
            area = area * 1076;
            return area;
        }else
                if("pe".equals(unidade)){
                    area = area * 929;
                    return area;       
        }else
                        if("milha".equals(unidade)){
                            area = area * 640;
                            return area;
            
        }else
                            if("acre".equals(unidade)){
                                area = area * 43560;
                                return area;
            
        }else{
                                return 000;//erro unidade n'ao encontrada
                            }
        
    }
}
