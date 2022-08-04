grammar Expr;

/* The grammar name and file name must match */

@header {
    package antlr;
}

// Start Symbol
prog: (feature)+ EOF                                                                     #Program
    ;

feature: featHeader featBody                                                             #FeatureDeclaration
       ;

featHeader: (Space)* Feature title NewLine+                                              #FeatureHeader
          ;

featBody: (scenario | outlineScenario)+                                                  #FeatureBody
        ;

blockBody: restOfLine (NewLine)* restOfLine*                                             #BlockBodyDeclaration
         ;

scenario: (Space | NewLine)* Scenario title NewLine+ blockBody                           #ScenarioDeclaration
        ;
outlineScenario: (Space | NewLine)* ScenarioOutline title NewLine+ blockBody        #OutlineScenarioDeclaration
               ;

restOfLine: (Space | NewLine)* Word (Word | Space)*                                      #RestOfLineDeclaration
          ;

title: (Space)* Word (Word | Space)*                                                     #TitleDeclaration
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