package com.design.pattern.visitor.example;

/**
 * ceo访问者
 */
public class CEOVisitor implements IVisitor {

    @Override
    public void visit(Engineer engineer) {
        System.out.println("程序员：" + engineer.name + ",KPI:" + engineer.kpi);
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("经理：" + manager.name + ",KPI:" + manager.kpi +
                ",新产品数量：" + manager.getProducts());
    }
}
