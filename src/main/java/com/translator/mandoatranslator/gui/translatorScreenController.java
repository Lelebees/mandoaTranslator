package com.translator.mandoatranslator.gui;

import com.translator.mandoatranslator.applogic.Machinations;
import com.translator.mandoatranslator.domain.TranslationDirection;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;

public class translatorScreenController {
    @FXML
    Label rightTranslatorLabel;
    @FXML
    Label leftTranslatorLabel;
    @FXML
    TextArea leftTranslatorInput;
    @FXML
    TextArea rightTranslatorInput;
    @FXML
    Button swapLanguagesButton;
    @FXML
    Button translateLanguagesButton;
    @FXML
    MenuBar menuBar;

    TranslationDirection translationDirection = TranslationDirection.ENGLISHTOMANDOA;

    public void Reverse(){
        if (translationDirection == TranslationDirection.ENGLISHTOMANDOA){
            translationDirection = TranslationDirection.MANDOATOENGLISH;
            leftTranslatorLabel.setText("Mando'a");
            rightTranslatorLabel.setText("English");
        } else {
            translationDirection = TranslationDirection.ENGLISHTOMANDOA;
            leftTranslatorLabel.setText("English");
            rightTranslatorLabel.setText("Mando'a");
        }
    }

    public void OpenAbout() throws IOException {
        java.awt.Desktop.getDesktop().browse(java.net.URI.create("https://github.com/Lelebees/mandoaTranslator"));
    }

    public void Translate(){
        rightTranslatorInput.setText(Machinations.Translate(translationDirection, leftTranslatorInput.getText()));

    }
}
