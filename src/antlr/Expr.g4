grammar Expr;

/* The grammar name and file name must match */

@header {
    package antlr;
}

// Start Symbol
feature: featHeader featBody EOF                                                         #FeatureDeclaration
       ;

featHeader: (Space)* Feature title NewLine+                                              #FeatureHeader
          ;

featBody: (scenario | outlineScenario)*                                                  #FeatureBody
        ;

blockBody: restOfLine (NewLine)* restOfLine*                                             #BlockBodyDeclaration
         ;

scenario: (Space | NewLine)* Scenario title NewLine+ blockBody                           #ScenarioDeclaration
        ;

outlineScenario: (Space | NewLine)* ScenarioOutline title NewLine+ blockBody             #OutlineScenarioDeclaration
               ;

restOfLine: (Space | NewLine)* word (word | Space)*                                      #RestOfLineDeclaration
          ;

title: (Space)* word (word | Space)*                                                     #TitleDeclaration
     ;

word: Word                                                                               #WordDeclaration
    ;

// Tokens
Comment: Space* '#' .*? NewLine -> skip;

Scenario: 'Scenario:';
ScenarioOutline: 'Scenario Outline:';
Feature: 'Feature:';

Space : [ \t];
NewLine : '\r'? '\n' | '\r';

Word: WD;
fragment WD: [a-zA-Z0-9]*;

ERR_TOKEN : . ;