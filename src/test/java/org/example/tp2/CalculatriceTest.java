package org.example.tp2;

import org.example.tp2.model.Calculatrice;
import org.junit.Test; // ✅ JUnit, pas TestNG
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class CalculatriceTest {

    @Mock
    private Calculatrice calculatriceMock;

    @Test
    public void testAdditionnerAvecMockito() {
        // Définir le comportement simulé du mock
        when(calculatriceMock.additionner(2, 3)).thenReturn(5);

        // Appel de la méthode sur le mock
        int resultat = calculatriceMock.additionner(2, 3);

        // Vérification du résultat simulé
        assertEquals(5, resultat);

        // Vérification des interactions
        verify(calculatriceMock).additionner(2, 3);
        verifyNoMoreInteractions(calculatriceMock);

        // Supposons qu'on veut aussi simuler getResult()
        when(calculatriceMock.getResult()).thenReturn(5);
        assertEquals(5, calculatriceMock.getResult());
        verify(calculatriceMock).getResult();
    }

    @Test
    public void testAdditionnerAvecObjetReel() {
        // Utilisation d'une instance réelle
        Calculatrice calculatrice = new Calculatrice();

        // Appel de la méthode réelle
        int resultat = calculatrice.additionner(2, 3);

        // Vérification du résultat
        assertEquals(5, resultat);

        // Vérification de l’état de l’objet
        assertEquals(5, calculatrice.getResult());
    }
}
