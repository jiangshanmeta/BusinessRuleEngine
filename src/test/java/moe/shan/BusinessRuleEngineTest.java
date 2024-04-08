package moe.shan;

import org.junit.Assert;
import org.junit.Test;
import static org.mockito.Mockito.*;


public class BusinessRuleEngineTest {
    @Test
    public void shouldHaveNoRuleInitially(){
        final BusinessRuleEngine businessRuleEngine = new BusinessRuleEngine(new Facts());

        Assert.assertEquals(0,businessRuleEngine.count());
    }

    @Test
    public void shouldAddTwoActions(){
        final BusinessRuleEngine businessRuleEngine = new BusinessRuleEngine(new Facts());

        businessRuleEngine.addRule(mock(Rule.class));
        businessRuleEngine.addRule(mock(Rule.class));

        Assert.assertEquals(2,businessRuleEngine.count());
    }

    @Test
    public void shouldExecuteOneAction(){
        final Facts mockFacts = mock(Facts.class);

        final BusinessRuleEngine businessRuleEngine = new BusinessRuleEngine(mockFacts);
        final Rule mockRule = mock(Rule.class);

        businessRuleEngine.addRule(mockRule);
        businessRuleEngine.run();

        verify(mockRule).perform(mockFacts);

    }

}
