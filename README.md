## Templates

### Shortcuts for **Pandoc**'s syntax

- `.pdiv` &rarr;
```markdown
::: {}

:::
```
- `.micro` &rarr; `&micro; (µ)`
- `.ohm` &rarr; `&Omega; (Ω)`
- `.deg` &rarr; `&deg; (°)`
- `.degc` &rarr; `&deg;C (°C)`
- `.->` &rarr; `&rarr; (→)`
- `.-<` &rarr; `&larr; (←)` 

### Shortcuts for [***pandoc-crossref***](https://lierdakil.github.io/pandoc-crossref/#references) filter usage

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
  - <https://github.com/pandocker/pandocker-lua-filters#landscape-pages>
```markdown
::: LANDSCAPE

:::
```

- `d.rmnote` &rarr;
  - <https://github.com/pandocker/pandocker-lua-filters#removable-note-block>
```markdown
::: rmnote

::: 
```

- `d.table` &rarr;
  - <https://github.com/pandocker/pandocker-lua-filters#add-width-options-to-ordinary-table>
```markdown
::: {.table }

:::
```
