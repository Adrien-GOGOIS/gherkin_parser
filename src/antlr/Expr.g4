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

featHeader: (Space)* Feature restOfLine NewLine+                                         #FeatureHeader
          ;

featBody: (scenario | outlineScenario)+                                                  #FeatureBody
        ;

blockBody: restOfLine (NewLine)* restOfLine*                                             #BlockBodyDeclaration
         ;

scenario: (Space | NewLine)* Scenario restOfLine NewLine+ blockBody                      #ScenarioDeclaration
        ;
outlineScenario: (Space | NewLine)* ScenarioOutline restOfLine NewLine+ blockBody        #OutlineScenarioDeclaration
               ;

restOfLine: (Space | NewLine)* Word (Word | Space)*                                      #RestOfLineDeclaration
          ;

// Tokens
Comment: Space* '#' .*? NewLine -> skip;

Scenario: 'Scenario:';
ScenarioOutline: 'Scenario Outline:';
Feature: 'Feature:';

Space : [ \t];
NewLine : '\r'? '\n' | '\r';
Word: WD;

fragment WD: ~[ \t\r\n]+?;