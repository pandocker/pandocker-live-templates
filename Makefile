all:
	pandoc README.md --template=template.xml -t html -o pandocker-live-templates/META-INF/output.xml -M version=$(VERSION)
	zip -r pandocker-live-templates-$(VERSION).zip pandocker-live-templates/
#	zip -d pandocker-live-templates.zip "*/.DS_Store"
