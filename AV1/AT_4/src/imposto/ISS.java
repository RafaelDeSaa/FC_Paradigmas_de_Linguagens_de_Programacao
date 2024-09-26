package imposto;

public class ISS {
    public class ISS implements Imposto {
        @Override
        public double calcular(Item item) {
            if (item instanceof Servico) {
                return item.getValor() * 0.22; 
            }
            return 0;
        }
    
}
