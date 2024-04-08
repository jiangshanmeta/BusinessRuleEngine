package moe.shan;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class InspectorTest {

    @Test
    public void inspectOneConditionEvaluatesTrue(){
        final Facts facts = new Facts();
        facts.setFact("jobTitle","CEO");
        final ConditionalAction conditionalAction = new ConditionalAction() {
            @Override
            public boolean evaluate(Facts facts) {
                return "CEO".equals(facts.getFact("jobTitle"));
            }

            @Override
            public void execute(Facts facts) {
                throw new UnsupportedOperationException();
            }
        };

        final Inspector inspector = new Inspector(conditionalAction);

        final List<Report> reportList = inspector.inspect(facts);

        Assert.assertEquals(1,reportList.size());
        Assert.assertEquals(true,reportList.get(0).isPositive());
    }

}
