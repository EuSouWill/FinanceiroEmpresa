public interface AssinaturaDigital extends Autenticavel{
    long hash();

    @Override
    default boolean estahAutenticado(String senhaDigitada) {
        return false;
    }
}
