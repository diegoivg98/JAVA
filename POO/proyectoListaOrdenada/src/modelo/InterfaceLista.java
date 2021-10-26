
package modelo;
/*
Especificacion lista = Lista()
Usa: bool = Booleano(), ent = Entero()
Metodos Publicos:
  crear(): lista
  anDer(elem): lista
  anIzq(elem): lista
  elimDer(): lista
  elimIzq(): lista
  estaOrdenada(): bool
  ordenarPorInsercion(): lista
  insertarOrdenada(elem): lista
Variables:
  forall e1, e2: elem
  forall l1, l2: lista
*/

public interface InterfaceLista {
    /*
      l1.crear().anDer(e1) = l1.crear().anIzq(e1)
      l1.anDer(e1) == l1.anIzq(e1) <-- l1.esVacia()
      
    
    */
    public Lista anDer(Integer elem);
    /*
      homologo a anIzq
    */
    public Lista anIzq(Integer elem);
    /*    
      l1.crear().elimDer() == l1.crear()
      l1.anDer(e1).elimDer() == l1
    
      l1.anIzq(e1).elimDer() == l1.crear() <-- l1.esVacia()
      l1.anIzq(e1).elimDer() == l1.elimDer().anIzq() <-- l1.esVacia().negacion()    
    */
    public Lista elimDer();
    /*
      homologo a elimDer()
    */    
    public Lista elimIzq();
    /*
      l1.crear().estaOrdenada() == b.true()
      l1.crear().anIzq(e1).estaOrdenada() == b.true()
      l1.crear().anDer(e1).estaOrdenada() == b.true()
      
      l1.anDer(e1).anDer(e2) == (e1 <= e2) and l1.estaOrdenada()
    */
    public boolean estaOrdenada();
    /*
       l1.crear().ordenarPorInsercion() == l1.crear()
       l1.anIzq(e1).ordenarPorInsercion() == l1.ordenarPorInsercion().insertarOrdenado(e1)
    */
    public Lista ordenarPorInsercion();
    /*
       l1.crear().insertarOrdenada(e1) == l1.crear().anIzq(e1)
       l1.anIzq(e1).insertarOrdenada(e2) == l1.anIzq(e1).anIzq(e2) <-- (e1 <= e2)
       l1.anIzq(e1).insertarOrdenada(e2) == l1.anIzq(e2).anIzq(e1) <-- (e1 > e2)
    */    
    public Lista insertarOrdenada(Integer elem);
}
