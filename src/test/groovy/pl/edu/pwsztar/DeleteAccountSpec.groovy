package pl.edu.pwsztar

import spock.lang.Specification
import spock.lang.Unroll

class DeleteAccountSpec extends Specification {

    static BankOperation bank;

    def setupSpec() {
        bank = new Bank();

    }

    def "should delete account number if account not exist"() {

        given: "prepare data"
        bank.createAccount()
        bank.deposit(1000,500)

        when: "the account is deleted"
        def result = bank.deleteAccount(1000)
        then: "check account number"
        result == BankOperation.ACCOUNT_NOT_EXISTS;
    }

    def "should delete account number if account exist"() {

        given: "prepare data"
        bank.createAccount()
        bank.deposit(1,500)
        when: "the account is deleted"
        def result = bank.deleteAccount(1)
        then: "check account number"
        result == 500;
    }
}
