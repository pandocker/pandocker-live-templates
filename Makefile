VERSION:=`git describe --tags`
all:
	pandoc README.md --template=template.xml -t html -o resources/META-INF/plugin.xml -M version=$(VERSION)
	head resources/META-INF/plugin.xml
clean:
	rm -rf out/*
