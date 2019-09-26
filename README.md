## Templates

### Shortcuts for **Pandoc**'s syntax

- `.pdiv` &rarr;
```markdown
::: {}

:::
```
- `.pspan` &rarr; `[]{}`
- `.micro` &rarr; `&micro; (µ)`
- `.ohm` &rarr; `&Omega; (Ω)`
- `.deg` &rarr; `&deg; (°)`
- `.degc` &rarr; `&deg;C (°C)`
- `.->` &rarr; `&rarr; (→)`
- `.rarr` &rarr; `&rarr; (→)`
- `.-<` &rarr; `&larr; (←)` 
- `.larr` &rarr; `&larr; (←)` 

### Shortcuts for [***pandoc-crossref***](https://lierdakil.github.io/pandoc-crossref/#references) filter usage

#### subfigures

- <https://lierdakil.github.io/pandoc-crossref/#subfigures>
- `.fdiv` &rarr;
```markdown 
::: {#fig:}

:::
```

#### Labels
- `l.eq` or `.equationlabel` &rarr; `#eq:` 
  - <https://lierdakil.github.io/pandoc-crossref/#equation-labels>
- `l.fig` or `.figurelabel` &rarr; `#fig:`
  - <https://lierdakil.github.io/pandoc-crossref/#image-labels>
- `l.lst` or `listinglabel` &rarr; `#lst:`
  - <https://lierdakil.github.io/pandoc-crossref/#code-block-labels>
- `l.sec` or `.sectionlabel` &rarr; `#sec:`
  - <https://lierdakil.github.io/pandoc-crossref/#section-labels>
- `l.tbl` or `.tablelabel` &rarr; `#tbl:`
  - <https://lierdakil.github.io/pandoc-crossref/#table-labels>

#### References

Visit <https://lierdakil.github.io/pandoc-crossref/#references> for more details

- `r.eq` or `.equationref` &rarr; `[@eq:]`
- `r.fig` or `.figureref` &rarr; `[@fig:]`
- `r.lst` or `.listingref` &rarr; `[@lst:]`
- `r.sec` or `.sectionref` &rarr; `[@sec:]`
- `r.tbl` or `.tableref` &rarr; `[@tbl:]`

### Shorcuts for [***pandocker-lua-filters***](https://github.com/pandocker/pandocker-lua-filters) filter usage

- `.csv2table` &rarr; `[](){.table }`
  - <https://github.com/pandocker/pandocker-lua-filters#convert-csv-into-table>
- `.include` &rarr; `# #include ""`
  - <https://github.com/pandocker/pandocker-lua-filters#concatenate-text-files>
- `.listingtable` &rarr; `[](){.listingtable}`
  - <https://github.com/pandocker/pandocker-lua-filters#text-file-listing>
- `.wavedrom` &rarr; `[](){.wavedrom}`
  - <https://github.com/pandocker/pandocker-lua-filters#wavedrom--bit-field>
- `.toc` &rarr; `\toc`
  - <https://github.com/pandocker/pandocker-lua-filters#toc--pagebreak>
- `d.lscape` or `.landscapediv` &rarr;
```markdown
::: LANDSCAPE

:::
```
  - <https://github.com/pandocker/pandocker-lua-filters#landscape-pages>
- `d.rmnote` or `.rmnotediv` &rarr;
```markdown
::: rmnote

::: 
```
  - <https://github.com/pandocker/pandocker-lua-filters#removable-note-block>
- `d.table` or `.tablediv` &rarr;
```markdown
::: {.table }

:::
```
  - <https://github.com/pandocker/pandocker-lua-filters#add-width-options-to-ordinary-table>
