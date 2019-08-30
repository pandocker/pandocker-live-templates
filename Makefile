all:
	pandoc README.md --template=template.xml -t html -o pandocker-live-templates/META-INF/plugin.xml -M version=$(VERSION)
	zip -r dist/pandocker-live-templates-$(VERSION).zip pandocker-live-templates/
	head pandocker-live-templates/META-INF/plugin.xml
