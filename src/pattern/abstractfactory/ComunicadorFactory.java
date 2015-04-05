package pattern.abstractfactory;

public interface ComunicadorFactory {
	Emissor createEmissor();
	Receptor createReceptor();
}
