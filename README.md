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
- `l.eq` &rarr; `#eq:` 
  - <https://lierdakil.github.io/pandoc-crossref/#equation-labels>
- `l.fig` &rarr; `#fig:`
  - <https://lierdakil.github.io/pandoc-crossref/#image-labels>
- `l.lst` &rarr; `#lst:`
  - <https://lierdakil.github.io/pandoc-crossref/#code-block-labels>
- `l.sec` &rarr; `#sec:`
  - <https://lierdakil.github.io/pandoc-crossref/#section-labels>
- `l.tbl` &rarr; `#tbl:`
  - <https://lierdakil.github.io/pandoc-crossref/#table-labels>

#### References

Visit <https://lierdakil.github.io/pandoc-crossref/#references> for more details

- `r.eq` &rarr; `[@eq:]`
- `r.fig` &rarr; `[@fig:]`
- `r.lst` &rarr; `[@lst:]`
- `r.sec` &rarr; `[@sec:]`
- `r.tbl` &rarr; `[@tbl:]`

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

- `d.lscape` &rarr;
```markdown
::: LANDSCAPE

:::
```
  - <https://github.com/pandocker/pandocker-lua-filters#landscape-pages>

- `d.rmnote` &rarr;
```markdown
::: rmnote

::: 
```
  - <https://github.com/pandocker/pandocker-lua-filters#removable-note-block>

- `d.table` &rarr;
```markdown
::: {.table }

:::
```
  - <https://github.com/pandocker/pandocker-lua-filters#add-width-options-to-ordinary-table>
