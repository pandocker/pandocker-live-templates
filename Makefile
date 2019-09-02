VERSION:=`git describe --tags`
all:
	pandoc CHANGES.md -t html -o out/CHANGES.html
	pandoc README.md --template=template.xml -t html --include-after-body=out/CHANGES.html -o resources/META-INF/plugin.xml -M version=$(VERSION)
	head resources/META-INF/plugin.xml
clean:
	rm -rf out/*
