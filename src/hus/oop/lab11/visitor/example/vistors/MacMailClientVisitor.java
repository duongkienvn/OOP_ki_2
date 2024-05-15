package hus.oop.lab11.visitor.example.vistors;

import hus.oop.lab11.visitor.example.structure.OperaMailClient;
import hus.oop.lab11.visitor.example.structure.SquirrelMailClient;
import hus.oop.lab11.visitor.example.structure.ZimbraMailClient;

public class MacMailClientVisitor implements MailClientVisitor {
    @Override
    public void visit(OperaMailClient mailClient) {

    }

    @Override
    public void visit(SquirrelMailClient mailClient) {

    }

    @Override
    public void visit(ZimbraMailClient mailClient) {

    }
}
