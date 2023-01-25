# HashCode e equals 

---

� S�o opera��es da classe Object utilizadas para comparar se um objeto � igual a outro <br>
� equals: lento, resposta 100% <br>
� hashCode: r�pido, por�m resposta positiva n�o � 100% <br>
� Tipos comuns (String, Date, Integer, Double, etc.) j� possuem
implementa��o para essas opera��es. Classes personalizadas
precisam sobrep�-las.

### Equals

M�todo que compara se o objeto � igual a outro, retornando
true ou false.
~~~~java
public class Program {
    public static void main(String[] args){
        String a = "Maria";
        String b = "Alex";
        System.out.println(a.equals(b));
    }
}
~~~~

### HashCode

M�todo que retorna um n�mero inteiro representando um c�digo gerado
a partir das informa��es do objeto

~~~~java
public class Program {
    public static void main(String[] args){
        String a = "Maria";
        String b = "Alex";
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }
}
~~~~

### Regra de ouro do HashCode

� Se o hashCode de dois objetos for diferente, ent�o os dois objetos s�o diferentes. <br>
� Se o c�digo de dois objetos for igual, muito provavelmente os objetos
s�o iguais (mas pode haver colis�o).