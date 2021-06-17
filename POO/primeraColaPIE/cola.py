
class Cola:
  def __init__(self):
    self.__crear()
  def __crear(self):
    self.__elementos = []
  def encolar(self, elem):
    self.__elementos.append(elem)
  def frente(self):
    return self.__elementos[0]
  def desencolar(self):
    if not self.esVacia():
      self.__elementos.__delitem__(0)
  def largo(self):
    return len(self.__elementos)
  def esVacia(self):
    return self.largo() == 0
    
c = Cola()
c.encolar('Hola mundo')
c.encolar(10)
c.encolar(True)

print 'la cola es vacia ? ', c.esVacia()


  
