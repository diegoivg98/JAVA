/*
Especificacion ent = Entero(val)
Usa: bool= Booleano()
Atributos privados:
val: numerico
Metodos publicos:
  crear(val): ent
  sucesor(): ent
  antecesor(): ent
  mayorQue(ent): bool
  menorQue(ent): bool
  igualQue(ent): bool
  getVal(): val
  multiplicar(ent): ent
  suma(ent): ent
  resta(ent): ent
  factorial(): ent
Metodos privados
  crear(val): void
Variables
  forall v1, v2: val
  forall n, m: ent
  forall b: bool
Axiomas
  n.crear(v1).sucesor() = n.crear(v1+1)
  n.crear(v1).antecesor() = n.crear(v1-1)

  n.crear(v1).mayorQue(m.crear(v2)) = b.true() <- v1 > v2
  n.crear(v1).mayorQue(m.crear(v2)) = b.false() <- ¬(V1 > V2)

  n.crear(v1).menorQue(m.crear(v2)) = b.true() <- v1 < v2
  n.crear(v1).menorQue(m.crear(v2)) = b.false() <- ¬(v1 < v2)

  n.crear(v1).igualQue(m.crear(v2)) = b.true() <- v1 == v2
  n.crear(v1).igualQue(m.crear(v2)) = b.false() <- ¬(v1 == v2)

  n.crear(v1).getVal() = v1

  n.crear(v1).suma(m.crear(v2)) = n <= v2 == 0
  n.crear(v1).suma(m.crear(v2)) = n.crear(v1).sucesor().suma(m.crear(v2).antecesor()) <- v2 > 0
  n.crear(v1).suma(m.crear(v2)) = n.crear(v1).antecesor().suma(m.crear(v2).sucesor()) <- v2 < 0

  n.crear(v1).resta(m.crear(v2)) = n <= v2 == 0
  n.crear(v1).resta(m.crear(v2)) = n.antecesor().resta(m.antecesor()) <= v2 > 0
  n.crear(v1).resta(m.crear(v2)) = n.sucesor().resta(m.sucesor()) <= v2 < 0
*/

package modelo;
public class Entero {
    private int val;
    public Entero(int val){
        this.crear(val);
    }
    private void crear(int val){
        this.val = val;
    }
    public Entero sucesor(){
        return new Entero(this.val+1);
    }
    public Entero antecesor(){
        return new Entero(this.val - 1);
    }    
    public boolean mayorQue(Entero n){
        return this.val > n.getVal();
    }    
    public boolean igualQue(Entero n){
        return this.val == n.getVal();
    }    
    public boolean menorQue(Entero n){
        return this.val < n.getVal();
    }
    public int getVal(){
        return this.val;
    }    
       
    public Entero cero(){
        return new Entero(0);
    }
    public Entero factorial() {
        if (this.igualQue(this.cero())) {//si num es = 0
            return this.cero().sucesor(); // retornar 1
        } else {
            return this.multiplicar(this.antecesor().factorial());
        }
    }
    
    public Entero suma(Entero m){        
        if(m.mayorQue(this.cero()))
            return this.sucesor().suma(m.antecesor());        
        if(m.menorQue(this.cero()))
            return this.antecesor().suma(m.sucesor());        
        return this;
    }
    
    public Entero resta(Entero m){
        /*        
            5 - 0 = 5
            5 - 2 = 4 - 1 = 3 - 0 = 3
            2 - 3 = 1 - 2 = 0 - 1 = -1 - 0 = -1
            5 - (-2) = 6 - (-1) = 7 - 0 = 7
        */  
        
        if(m.mayorQue(this.cero()))
            return this.antecesor().resta(m.antecesor());
        if(m.menorQue(this.cero()))
            return this.sucesor().resta(m.sucesor());
        return this;
    }
    /*
    n * 0 = 0
    n * 1 = n
    n * (m+1) = n*m + n
    n * (m -1) = n*m - n                 (m-2) (m-1) m (m+1)
    n * -1 = -n
    ¬(n == 0 or n == 1 or n > 1 or n == -1)
    n =/= 0 and n =/= 1 & n <= 1 and n =/= -1
          -1 0 1
    */
    public Entero multiplicar(Entero m){
        if(m.igualQue(m.cero()))
            return this.cero();
        if(m.igualQue(this.cero().sucesor()))
            return this;
        if(m.mayorQue(this.cero().sucesor()))
            return this.multiplicar(m.antecesor().suma(this));
        if(m.igualQue(this.cero().antecesor()))
            return new Entero(-this.val);
        return this.multiplicar(m.sucesor()).resta(this);
    }
    
    public Entero division(Entero m){
        if (this.menorQue(m))
            return this.cero();
        return this.resta(m).division(m).sucesor();
        
    }
    
    //REALIZAR OPERACION RESTO DE LA DIVISION ENTERA
    
    public Entero mod(Entero m){//obtener resto
        if (this.menorQue(m))
            return this;
        return this.resta(m).mod(m);
    }
    
    public Entero mcd(Entero n){//maximo comun divisor
        if (n.igualQue(this.cero()))
            return this;
        return n.mcd(this.mod(n));
    }
}