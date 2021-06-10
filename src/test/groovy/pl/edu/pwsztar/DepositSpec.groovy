package pl.edu.pwsztar

import spock.lang.Specification

class DepositSpec extends Specification {

    static BankOperation bank;

    def setupSpec() {
        bank = new Bank();

    }

    def "should deposit money if account not exists"() {

        given: "prepare data"
        bank.createAccount()
        when: "deposit money"
        def result = bank.deposit(50,500)
        then: "check result"
        !result
    }

    def "should deposit money if account exists"() {

        given: "prepare data"
        bank.createAccount()
        when: "deposit money"
        def result = bank.deposit(1,500)
        then: "check result"
        result
    }
}
