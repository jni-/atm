package ca.ulaval.glo4002.atm.application;

public class CannotRegisterContractTwiceException extends RuntimeException {

    public CannotRegisterContractTwiceException(Class<?> contract) {
        super("You've tried to register this contract twice : '" + contract.getCanonicalName() + "'");
    }

    private static final long serialVersionUID = 1L;

}
