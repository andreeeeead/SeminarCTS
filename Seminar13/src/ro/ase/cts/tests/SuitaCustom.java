package ro.ase.cts.tests;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import ro.ase.cts.categorii_teste.TesteGetPromovabilitate;
import ro.ase.cts.categorii_teste.TesteUrgente;

@RunWith(Categories.class)
@Categories.IncludeCategory(TesteGetPromovabilitate.class)
@Categories.ExcludeCategory(TesteUrgente.class)
@Suite.SuiteClasses({GrupaTest.class, GrupaTestWithMocks.class})
public class SuitaCustom {
}
