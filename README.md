## Templates

### Shortcuts for **Pandoc**'s syntax

- `.pdiv` &rarr;
```markdown
::: {$CLASS$}
$END$
:::
```
- `.micro` &rarr; `&micro; (µ)`
- `.ohm` &rarr; `&Omega; (Ω)`
- `.deg` &rarr; `&deg; (°)`
- `.degc` &rarr; `&deg;C (°C)`
- `.->` &rarr; `&rarr; (→)`
- `.-<` &rarr; `&larr; (←)` 

### Shortcuts for **pandoc-crossref** filter usage

- `l.eq` &rarr; `#eq:` 
- `l.fig` &rarr; `#fig:`
- `l.lst` &rarr; `#lst:`
- `l.sec` &rarr; `#sec:`
- `l.tbl` &rarr; `#tbl:`
- `r.eq` &rarr; `[@eq:]`
- `r.fig` &rarr; `[@fig:]`
- `r.lst` &rarr; `[@lst:]`
- `r.sec` &rarr; `[@sec:]`
- `r.tbl` &rarr; `[@tbl:]`

### Shorcuts for **pandocker-lua-filters** filter usage

- `.csv2table` &rarr; `[](){.table }`
- `.include` &rarr; `# #include ""`
- `.listingtable` &rarr; `[](){.listingtable}`
- `.wavedrom` &rarr; `[](){.wavedrom}`
- `.toc` &rarr; `\toc`
- `d.lscape` &rarr; 
```markdown
::: LANDSCAPE

:::
```
- `d.rmnote` &rarr;
```markdown
::: rmnote

::: 
```
- `d.table` &rarr;
```markdown
::: {.table }

:::
```
