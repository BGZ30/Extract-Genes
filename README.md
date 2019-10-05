# Extract-Genes
Given a DNA string, this code can find all the genes in it.
DNA string is represented by a combination of four letters; A,C,G, and T. A gene starts with 'AGT' and can ends with TAA, TAG, or TGA. 
A gene's length is a multiplie of three.

Examples:
1-DNA string: ATGCCCTAGATGAAATAGATGGGGTAGATGCGCTAGATGCCACTAGATGCTCTAG
   Genes are: ATGCCCTAG   ATGAAATAG   ATGGGGTAG   ATGCGCTAG
   Note that 'ATGCCACTAG' is not valied.

2-DNA string: CATGAAATAATGATAATGGTAGATAGATGACCACTATGCCATAG
  Genes are: ATGAAATAA  ATGGTAGATAGATGA   ATGCCATAG
  
3-DNA string: CCATGGTGAGAATGTCCGTCATACGTCA
  Answer: no genes

