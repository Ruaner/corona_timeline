from service.utils.download import download_events, download_news

if __name__ == '__main__':
    download_news('./data')
    download_events('./data')
