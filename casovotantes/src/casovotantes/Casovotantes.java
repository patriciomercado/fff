package casovotantes;

public class Casovotantes {
    public static void main(String[] args) {

      int n = (int)Math.floor(Math.random()*(100-500)+500);
      String [][] votantes = new String [n][2];
      int aprob=0;
      int reprob=0;
      int totalaprob=0;
      for(int i=0; i<n;i++){
          for(int j=0;j<2;j++){
          int z = (int)Math.floor(Math.random()*(0-3)+3);
          while (z<0 && z>2){
              z = (int)Math.floor(Math.random()*(0-3)+3);
          }
              if(z==2){
                  votantes[i][j]= ("n");
              }
              if(z==1){
                  votantes[i][j]= Integer.toString(z);
              }              
              if(z==0){
                  votantes[i][j]= Integer.toString(z);
              }             
              }
          }
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                if((votantes[i][0]).matches("[0-2]*")){
                    if(Integer.parseInt(votantes[i][0])==1){
                        aprob=aprob+1;
                    }
                }
                if((votantes[i][1]).matches("[0-2]*")){
                    if(Integer.parseInt(votantes[i][1])==0){
                        reprob=reprob+1;
                    }
                }
                if((votantes[i][j]).matches("[0-2]*")){
                    if(Integer.parseInt(votantes[i][j])==1){
                        totalaprob=totalaprob+1;
                    }
                }
                
          }
      }
      System.out.println("Los Hombres que aprovaron el gobierno de la gordis fueron: " +aprob);
      System.out.println("Las Mujeres que reprovaron el gobierno de la gordis fueron: " +reprob);
      System.out.println("El total que aprueba el gobierno de la gordis son: " +totalaprob);
      System.out.println("El total de votates son: " +(n+n));
    }
}
    
